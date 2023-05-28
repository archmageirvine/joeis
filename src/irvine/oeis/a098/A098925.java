package irvine.oeis.a098;
// manually fract21/trigf at 2023-05-27 19:57

import irvine.math.z.Z;
import irvine.oeis.a092.A092865;

/**
 * A098925 Distribution of the number of ways for a child to climb a staircase having r steps (one step or two steps at a time).
 * @author Georg Fischer
 */
public class A098925 extends A092865 {

  public Z next() {
    return super.next().abs();
  }
}
