package irvine.oeis.a004;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004186.
 * @author Sean A. Irvine
 */
public class A004186 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final char[] s = String.valueOf(++mN).toCharArray();
    Arrays.sort(s);
    return new Z(new StringBuilder(new String(s)).reverse().toString());
  }
}
