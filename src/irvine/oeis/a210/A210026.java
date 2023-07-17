package irvine.oeis.a210;

import irvine.math.z.Z;

/**
 * A210026 List of successive digits in A210025.
 * @author Sean A. Irvine
 */
public class A210026 extends A210025 {

  /** Construct the sequence. */
  public A210026() {
    super(1);
  }

  private final StringBuilder mDigits = new StringBuilder();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mDigits.length()) {
      mDigits.append(super.next().toString());
    }
    return Z.valueOf(mDigits.charAt(mN) - '0');
  }
}
