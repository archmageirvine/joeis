package irvine.oeis.a004;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004186 Arrange digits of n in decreasing order.
 * @author Sean A. Irvine
 */
public class A004186 extends AbstractSequence {

  /* Construct the sequence. */
  public A004186() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    final char[] s = String.valueOf(++mN).toCharArray();
    Arrays.sort(s);
    return new Z(new StringBuilder(new String(s)).reverse());
  }
}
