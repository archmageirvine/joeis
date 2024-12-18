package irvine.oeis.a362;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A362123 Number of letters in the British English name of n, excluding spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A362123 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(English.SINGLETON.toText(++mN).replaceAll("[ -]", "").length());
  }
}

