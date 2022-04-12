package irvine.oeis.a103;
// manually partprom/partprod at 2022-04-12 12:13

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.a000.A000204;

/**
 * A103845 Product of first n Lucas numbers, plus one.
 * @author Georg Fischer
 */
public class A103845 extends PartialProductSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A103845() {
    super(new A000204());
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return super.next().add(1);
  }
}
