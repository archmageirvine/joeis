package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080628 Consider <code>3 X 3 X 3</code> Rubik cube, but only allow the &lt;U, R&gt; group to act; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080628 extends FiniteSequence {

  /** Construct the sequence. */
  public A080628() {
    super(1, 4, 10, 24, 58, 140, 338, 816, 1970, 4756, 11448, 27448, 65260, 154192, 360692, 827540, 1851345, 3968840, 7891990, 13659821, 18471682, 16586822, 8039455, 1511110, 47351, 87);
  }
}
