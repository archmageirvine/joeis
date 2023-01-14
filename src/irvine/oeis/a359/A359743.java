package irvine.oeis.a359;

import irvine.math.z.Z;

/**
 * A359743 Viggo Brun's ternary continued fraction algorithm applied to { log 2, log 3/2, log 5/4 } produces a list of triples (p,q,r); sequence gives q values.
 * @author Sean A. Irvine
 */
public class A359743 extends A359742 {

  @Override
  protected Z select(final Z b0, final Z b1, final Z b2) {
    return b1;
  }
}
