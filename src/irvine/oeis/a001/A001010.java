package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000682;
import irvine.oeis.a007.A007822;

/**
 * A001010 Number of symmetric foldings of a strip of n stamps.
 * @author Sean A. Irvine
 */
public class A001010 extends AlternatingSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A001010() {
    super(new A007822(), new A000682().skip(1));
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return super.next();
    } else {
      return super.next().multiply2();
    }
  }
}
