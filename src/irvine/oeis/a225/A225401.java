package irvine.oeis.a225;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A225401 10-adic integer x such that x^3 = -7/9.
 * @author Georg Fischer
 */
public class A225401 extends AbstractSequence {

  private int mN;
  private Z mBn0;
  private Z mBn1;
  private final Z mPm1;
  private final Z mPm2;
  private final int mExp;
  private final Z mPa;
  private final int mBase;
  private Z mPow; // base^n
  private final int mVariant; // for different formulas

  /** Construct the sequence. */
  public A225401() {
    this(0, 3, 3, 9, 3, +7, 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param b1 initial value b(1)
   * @param pm1 first factor
   * @param pm2 second factor
   * @param exp exponent
   * @param pa additive constant
   * @param base compute mod <code>base^n</code>
   */
  public A225401(final int offset, final long b1, final long pm1, final long pm2, final int exp, final long pa, final int base) {
    super(offset);
    mN = -1;
    mBn0 = Z.ZERO;
    mBn1 = Z.valueOf(b1);
    mPm1 = Z.valueOf(pm1);
    mPm2 = Z.valueOf(pm2);
    mExp = exp;
    mPa = Z.valueOf(pa);
    mBase = base;
    mPow = Z.ONE;
    mVariant = 0; // (pm1 != 1 && pm2 == 1) ? 1 : 0;
  }

  /*
    Recurrence b(0) = 0 and b(1) = 3, b(n+1) = b(n) + 3 * (9 * b(n)^3 + 7) mod 10^(n+1) for n >= 1,
    then a(n) = (b(n+1) - b(n))/10^n.
  */
  @Override
  public Z next() {
    ++mN;
    mBn0 = mBn1;
    final Z pow1 = mPow.multiply(mBase);
    switch (mVariant) {
      case 1: // for A309570, A309606, A309642
        mBn1 = mBn1.add(mPm1.multiply(mBn1.pow(mExp).add(mPa)).mod(pow1));
        break;
      case 0:
      default:
        mBn1 = mBn1.add(mPm1.multiply(mPm2.multiply(mBn1.pow(mExp)).add(mPa)).mod(pow1));
        break;
    }
    final Z an = mN == 0 ? mBn0 : mBn1.subtract(mBn0).divide(mPow);
    mPow = pow1;
    // System.out.println("mN=" + mN + ", b(n)=" + mBn0 + ", b(n+1)=" + mBn1 + ", base^n=" + mPow + ", a(n)=" + an);
    //System.err.print("," + mBn0);
    return an;
  }

  /**
   * Test program.
   * @param args <code>b1, m1, m2, exp, a, base</code>
   */
  public static void main(final String[] args) {
    int iarg = 0;
    long b1 = 3;
    long pm1 = 3;
    long pm2 = 9;
    int exp = 3;
    long pa = 7;
    int base = 10;
    try {
      if (iarg < args.length) {
        b1 = Long.parseLong(args[iarg++]);
      }
      if (iarg < args.length) {
        pm1 = Long.parseLong(args[iarg++]);
      }
      if (iarg < args.length) {
        pm2 = Long.parseLong(args[iarg++]);
      }
      if (iarg < args.length) {
        exp = Integer.parseInt(args[iarg++]);
      }
      if (iarg < args.length) {
        pa = Long.parseLong(args[iarg++]);
      }
      if (iarg < args.length) {
        base = Integer.parseInt(args[iarg++]);
      }
    } catch (final RuntimeException exc) {
      System.err.print("bad input");
    }
    System.out.println(" b1=" + b1 + ", pm1=" + pm1 + ", pm2=" + pm2 + ", exp=" + exp + ", pa=" + pa + ", base=" + base);
    final Sequence seq = new A225401(0, b1, pm1, pm2, exp, pa, base);
    for (int ix = 0; ix < 32; ++ix) {
      System.out.print(seq.next() + ", ");
    }
  }
}
