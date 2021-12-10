package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A002660 a(n) = Sum_{d|n, d &lt;= 3} d^2 + 3*Sum_{d|n, d&gt;3} d.
 * @author Sean A. Irvine
 */
public class A002660 extends A000203 {

  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    return super.next().multiply(3).subtract(mEven ? 4 : 2);
  }
}

// Alternative implementation.

// import irvine.math.z.Z;
// import irvine.math.group.PolynomialRingField;
// import irvine.math.group.IntegerField;
// import irvine.math.polynomial.Polynomial;
// import irvine.oeis.transform.InverseMobiusTransformSequence;
// import irvine.oeis.Sequence;

// /**
//  * A002660.
//  * @author Sean A. Irvine
//  */
// public class A002660 extends InverseMobiusTransformSequence {

//   private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

//   private static class MySequence implements Sequence {
//     private final Polynomial<Z> NUM = Polynomial.create(0, 1, 2, 2, -2);
//     private final Polynomial<Z> DEN = Polynomial.create(1, -2, 1);
//     private int mN = 0;

//     @Override
//     public Z nextQ() {
//       return RING.coeff(NUM, DEN, ++mN);
//     }
//   }

//   /** Construct the sequence. */
//   public A002660() {
//     super(new MySequence(), 0);
//     nextQ();
//   }
// }
