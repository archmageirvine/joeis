package irvine.oeis.a393;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393294 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A393294 extends Sequence1 {

  private static final MessageDigest MD5;
  static {
    try {
      MD5 = MessageDigest.getInstance("MD5");
    } catch (final NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  private static byte[] md5(final byte[] s) {
    MD5.reset();
    return MD5.digest(s);
  }

  private byte[] mLargest = null;
  private byte[] mHash = null;
  private long mIterations = 0;

  @Override
  public Z next() {
    if (mHash == null) {
      mHash = new byte[16];
      mLargest = mHash;
      return Z.ZERO;
    }
    while (true) {
      ++mIterations;
      mHash = md5(mHash);
      //System.out.println("hash 0x" + ByteUtils.toHex(mHash));
      final int c = Arrays.compareUnsigned(mHash, mLargest);
      if (c == 0) {
        // Actually this check is not strong enough to guarantee cycle
        // detection, since we might enter a smaller cycle that does
        // not contain the current largest value.  But short of doing
        // a double step arrangement or remembering intermediate values
        // this is the simplest test to try.
        return null;
      }
      if (c > 0) {
        mLargest = mHash;
        return Z.valueOf(mIterations);
      }
    }
  }
}
