package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070328 extends Sequence1 {

  private long mN = 0;
  private final char mInsert;

  protected A070328(final char insert) {
    mInsert = insert;
  }

  /** Construct the sequence. */
  public A070328() {
    this('1');
  }

  private boolean is(final String s) {
    for (int k = mInsert == '0' ? 1 : 0; k <= s.length(); ++k) {
      if (new Z(s.substring(0, k) + mInsert + s.substring(k)).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      if (is(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}
