package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.Sequence;

/**
 * A000713 EULER transform of <code>3, 2, 2, 2, 2, 2, 2, 2, </code>...
 * @author Sean A. Irvine
 */
public class A000713 extends EulerTransformSequence {

  private static final class MySequence implements Sequence {
    private boolean mFirst = true;

    @Override
    public Z next() {
      if (mFirst) {
        mFirst = false;
        return Z.THREE;
      }
      return Z.TWO;
    }
  }

  /** Construct this sequence. */
  public A000713() {
    super(new MySequence(), 0);
  }
}
