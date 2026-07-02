package irvine.oeis.a280;

import irvine.oeis.a000.A000027;
import irvine.oeis.a397.A397126;

/**
 * A280864 Lexicographically earliest infinite sequence of distinct positive terms such that, for any prime p, any run of consecutive multiples of p has length exactly 2.
 * @author Sean A. Irvine
 */
public class A280864 extends A397126 {

  /** Construct the sequence. */
  public A280864() {
    super(new A000027());
  }
}
