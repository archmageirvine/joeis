package irvine.oeis.a130;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A130142.
 * @author Sean A. Irvine
 */
public class A130142 implements Sequence {

  private static final Fast PRIME = new Fast();
  private static final Factorizer FACTOR = new Cheetah();
  private static final String[] VALUES = {
    "13",
    "127",
    "1074079",
    "60407309048887142953335371",
    "185845498742374514224278660344320531777763984538227784588341797",
  };

  private long mN = -1;
  private boolean mPrintProof = false;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 17) {
      return Z.NEG_ONE;
    }
    Z n = Z.valueOf(mN).multiply2().add(1);
    while (true) {
      if (mPrintProof) {
        System.out.println(n.toString());
      }
      if (PRIME.isPrime(n)) {
        return n;
      }
      final FactorSequence fs = new FactorSequence(n);
      FACTOR.factor(fs);
      if (mPrintProof) {
        System.out.println(fs.toString());
      }
      if (!fs.isComplete()) {
        throw new UnsupportedOperationException("n=" + mN + " f=" + n);
      }
      final Z[] d = fs.divisorsSorted();
      if (d[1].equals(Z.TWO)) {
        // If we ever get two as last digit, we will never get rid of it
        return Z.NEG_ONE;
      }
      final StringBuilder sb = new StringBuilder();
      for (int k = d.length - 1; k > 0; --k) {
        final Z z = d[k];
        if (!z.equals(n)) {
          sb.append(new StringBuilder(z.toString()).reverse());
        }
      }
      n = new Z(sb.toString());
    }
  }

  /**
   * A17 stuff.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {

    if (args.length == 0) {
      System.err.println("Usage: A130142 term or -t");
      return;
    }

    if ("-t".equals(args[0])) {
      final FactorSequence fs = new FactorSequence();
      /*
      final Z n = new Z("73190137764973631955179153612973");
      fs.add(3, FactorSequence.PRIME);
      fs.add(new Z("271770016477"), FactorSequence.PRIME);
      fs.add(new Z("89769699044004904283"), FactorSequence.PRIME);
      */

      final Z n = new Z("19907871795058934542388521769342948217410231790903962382409400440996967981349400135187746100771723");
      for (final String s : VALUES) {
        fs.add(new Z(s), FactorSequence.PRIME);
      }


      final Z[] d = fs.divisors();
      final StringBuilder sb = new StringBuilder();
      Arrays.sort(d);
      for (int k = d.length - 1; k >= 0; --k) {
        final Z z = d[k];
        if (!n.equals(z)) {
          System.out.println(z);
          sb.append(new StringBuilder(z.toString()).reverse());
        }
      }
      System.out.println("New n = " + sb.toString());
    } else {
      // Generate partial proof for sequence.
      final A130142 seq = new A130142();
      for (int k = 0; k < Integer.parseInt(args[0]); ++k) {
        seq.next();
      }
      seq.mPrintProof = true;
      seq.next();
    }

    /*
    final FactorSequence fs = new FactorSequence();
    fs.add(29, FactorSequence.PRIME, 2);
    fs.add(new Z("5546454298803948416569"), FactorSequence.PRIME);
    fs.add(new Z("8370112457804191610629"), FactorSequence.PRIME);
    fs.add(new Z("13338101723922940394396774098231"), FactorSequence.PRIME);
    fs.add(new Z("345111672681489292530961043464303237918570147336150469919363833"), FactorSequence.PRIME);
    final Z[] d = fs.divisors();
    final StringBuilder sb = new StringBuilder();
    final Z n = new Z("179719996575730910515106159846737337176838928854211713151146478934050745192125561494032705883138679506795913535235676554615981512719833136443");
    Arrays.sort(d);
    for (int k = d.length - 1; k >= 0; --k) {
      final Z z = d[k];
      if (!n.equals(z)) {
        System.out.println(z);
        sb.append(new StringBuilder(z.toString()).reverse());
      }
    }
    System.out.println("New n = " + sb.toString());
    */
  }
}

