package irvine.oeis.a103;
// manually trigfm/trigf at 2023-10-11 17:15

import irvine.oeis.a071.A071675;
import irvine.oeis.triangle.Inverse;

/**
 * A103778 Inverse of trinomial triangle A071675.
 * @author Georg Fischer
 */
public class A103778 extends Inverse {

  /** Construct the sequence. */
  public A103778() {
    super(0, new A071675());
  }
}
