package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032103 Number of dyslexic identity planted planar trees with <code>n+1</code> nodes and leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A032103 extends A032101 {

  @Override
  public Z start() {
    return Z.TWO;
  }
}
