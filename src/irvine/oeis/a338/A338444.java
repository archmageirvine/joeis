package irvine.oeis.a338;

import irvine.oeis.a005.A005117;
import irvine.oeis.a397.A397126;

/**
 * A338444 Lexicographically earliest sequence of distinct squarefree numbers such that for any prime p, any run of consecutive multiples of p has length exactly 2.
 * @author Sean A. Irvine
 */
public class A338444 extends A397126 {

  /** Construct the sequence. */
  public A338444() {
    super(new A005117());
  }
}
