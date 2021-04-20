package irvine.oeis.a030;
// manually

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030515 Numbers with exactly 6 divisors.
 * @author Georg Fischer
 */
public class A030515 implements Sequence {

  protected long mN; // current index
  protected final Z mK; // exact number of divisors

  /**
   * Construct the sequence.
   */
  public A030515() {
    this(6);
  }

  /**
   * Generalized constructor with parameter.
   *
   * @param k number of divisors
   */
  public A030515(final int k) {
    mN = 3;
    mK = Z.valueOf(k);
  }

  @Override
  public Z next() {
    while (true) {
      if (mK.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }

  /**
   * Main method, filters a file and writes the copy to STDOUT.
   *
   * @param args command line arguments: filename, or "-" or none for STDIN
   */
  public static void main(final String[] args) {
    int iarg = 0;
    int k = 3;
    if (iarg < args.length) { // consume all arguments
      try {
        k = Integer.parseInt(args[++iarg]);
      } catch (final RuntimeException exc) { // take default
      }
      final Sequence seq = new A030515(k);
      String sep = "";
      for (int i = 1; i <= 64; ++i) {
        System.out.print(sep + seq.next());
        sep = ",";
      }
    } else {
      System.out.println("usage: java -cp joeis.jar irvine.oeis.a030.A030515 number_of_divisors");
    }
  } // main
}
