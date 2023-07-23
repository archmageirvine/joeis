package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a025.A025487;
import irvine.oeis.closure.MultiplicativeClosureSequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A051466 Largest product of primorials less than A025487(n) that divides A025487(n).
 * @author Sean A. Irvine
 */
public class A051466 extends AbstractSequence {

  private final A025487 mSeq1 = new A025487();

  /** Construct the sequence. */
  public A051466() {
    super(2);
  }

  {
    mSeq1.next();
  }

  private final MemorySequence mA = MemorySequence.cachedSequence(new MultiplicativeClosureSequence(new A002110().skip(1)));

  @Override
  public Z next() {
    final Z t = mSeq1.next();
    int k = -1;
    Z res = Z.ONE;
    while (true) {
      final Z a = mA.a(++k);
      if (a.compareTo(t) >= 0) {
        break;
      }
      if (t.mod(a).isZero()) {
        res = a;
      }
    }
    return res;
  }
}
