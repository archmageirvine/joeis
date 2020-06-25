package irvine.oeis.a032;
// Generated by gen_seq4.pl floor3cr 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032637 <code>[ pi^n / e ]</code>.
 * @author Georg Fischer
 */
public class A032637 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.PI, CR.valueOf(++mN)).divide(CR.E).floor();
  }
}
