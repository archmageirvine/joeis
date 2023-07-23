package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a045.A045704;

/**
 * A063907 Lesser of twin numbers (differing by 1) of the form F(i)^2 + F(j)^3 (A045704), where F() are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A063907 extends AbstractSequence {

  private final A045704 mSeq1 = new A045704();

  /** Construct the sequence. */
  public A063907() {
    super(0);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mSeq1.next();
      if (mA.subtract(t).equals(Z.ONE)) {
        return t;
      }
    }
  }
}
