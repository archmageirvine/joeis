package irvine.oeis.a069;

import irvine.math.function.Function1;
import irvine.math.function.Functions;
import irvine.math.z.Frobenius;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069743.
 * @author Sean A. Irvine
 */
public class A069761 extends Sequence2 {

  private long mN = 1;
  private final Function1 mFunction;

  protected A069761(final Function1 function) {
    mFunction = function;
  }

  /** Construct the sequence. */
  public A069761() {
    this(Functions.TETRAHEDRAL);
  }

  @Override
  public Z next() {
    ++mN;
    final Z p1 = mFunction.z(mN);
    final Z p2 = mFunction.z(mN + 1);
    final Z p3 = mFunction.z(mN + 2);
    final Z p4 = mFunction.z(mN + 3);
    return Frobenius.frobenius(p1, p2, p3, p4);
  }
}
