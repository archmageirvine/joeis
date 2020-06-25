package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032633 <code>[ n^3 /</code> pi <code>]</code>.
 * @author Sean A. Irvine
 */
public class A032633 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN).pow(3)).divide(CR.PI).floor();
  }
}
