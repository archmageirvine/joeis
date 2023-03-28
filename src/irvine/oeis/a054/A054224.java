package irvine.oeis.a054;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;

/**
 * A054224 A054221 without cubes.
 * @author Sean A. Irvine
 */
public class A054224 extends FilterSequence {

  /** Construct the sequence. */
  public A054224() {
    super(new A054221(), k -> !ZUtils.isCube(k));
  }
}
