package irvine.oeis.a069;
// manually simtraf at 2023-09-18 22:10

import irvine.math.z.Z;
import irvine.oeis.a036.A036937;
import irvine.oeis.transform.SimpleTransformSequence;
import irvine.util.string.StringUtils;

/**
 * A069841 A036937(n) - 222...2 (with n 2s) interpreted as binary numbers and converted to decimal.
 * @author Georg Fischer
 */
public class A069841 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A069841() {
    super(1, new A036937(), v -> new Z(v.subtract(new Z(StringUtils.rep('2', v.toString().length()))).toString(), 2));
  }
}
