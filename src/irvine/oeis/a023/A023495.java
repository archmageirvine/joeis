package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a090.A090946;

/**
 * A023495 a(n) = b(n) + d(n), where b(n) = (n-th Lucas number &gt; 3) and d(n) = (n-th non-Lucas number).
 * @author Sean A. Irvine
 */
public class A023495 extends A000204 {

  /** Construct the sequence. */
  public A023495() {
    super(0);
  }

  final Sequence mA = new A090946();

  {
    super.next();
    next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
