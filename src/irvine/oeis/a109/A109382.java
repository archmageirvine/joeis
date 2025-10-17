package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.EditDist;
import irvine.util.string.English;

/**
 * A109382 Levenshtein distance between successive English names of nonnegative integers, excluding spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A109382 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = English.SINGLETON.toRawText(++mN);
    final String t = English.SINGLETON.toRawText(mN + 1);
    return Z.valueOf(EditDist.editDistance(s, t));
  }
}
