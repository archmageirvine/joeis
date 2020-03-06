package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029857 Number of rooted trees with 3-colored leaves.
 * @author Sean A. Irvine
 */
public class A029857 extends A029856 {

  @Override
  protected Z first() {
    return Z.THREE;
  }
}
