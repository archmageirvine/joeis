package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001146;

/**
 * A037267 Number of Boolean functions on n inputs with representing polynomial of max degree n.
 * @author Sean A. Irvine
 */
public class A037267 extends A001146 {

  private final Sequence mA = new A037293();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

