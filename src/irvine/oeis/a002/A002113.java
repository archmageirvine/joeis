package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.UnionSequence;
import irvine.oeis.a056.A056524;
import irvine.oeis.a056.A056525;

/**
 * A002113 Palindromes in base 10.
 * @author Sean A. Irvine
 */
public class A002113 extends UnionSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A002113() {
    super(new A056525(), new A056524());
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next();
  }
}
