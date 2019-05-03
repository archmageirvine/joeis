package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025234 An L-tile is a <code>2 X 2</code> square with the upper <code>1 X 1</code> subsquare removed; no rotations are allowed. <code>a(n) =</code> number of tilings of a <code>4 X n</code> rectangle using tiles that are either <code>1 X 1</code> squares or <code>L-tiles</code>.
 * @author Sean A. Irvine
 */
public class A025234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025234() {
    super(new long[] {-1, 0, 4, 5, 1}, new long[] {1, 0, 4, 8, 28});
  }
}
