package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030674 Cube root of A030673.
 * @author Sean A. Irvine
 */
public class A030674 extends A030673 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}

