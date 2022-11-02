package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A111782 Ninth column (m=8) of unsigned triangle A111595.
 * @author Georg Fischer
 */
public class A111782 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111782() {
    super(8, "[[0],[-1, 1],[8],[8,-1]]", "1", 0);
    setGfType(1);
  }
}
