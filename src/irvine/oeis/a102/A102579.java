package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.a369.A369283;

/**
 * A102579 Number of n-node labeled digraphs whose underlying graphs are mating graphs, cf. A006024.
 * @author Gregory Morse
 */
public class A102579 extends A369283 {
  private final Z mChoices;
  private int mN = -1;

  protected A102579(final Z choices) {
    mChoices = choices;
  }

  /** Construct the sequence. */
  public A102579() {
    this(Z.THREE);
  }

  @Override
  public Z next() {
    return RING.eval(row(++mN), mChoices);
  }
}
