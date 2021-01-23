package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014434 Sum[ a[ i ]a[ n-i ],{i,0,n-1} ], a[ 0 ] == 1, a[ 1 ]==5.
 * @author Sean A. Irvine
 */
public class A014434 extends A014431 {

  @Override
  protected Z a1() {
    return Z.FIVE;
  }
}

