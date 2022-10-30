package irvine.oeis.a066;
// manually partprom/partprod at 2022-04-12 12:04

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.a002.A002110;

/**
 * A066266 Product of first n primorials + 1.
 * @author Georg Fischer
 */
public class A066266 extends PartialProductSequence {

  /** Construct the sequence. */
  public A066266() {
    super(1, new A002110());
    next();
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
