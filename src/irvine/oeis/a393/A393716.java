package irvine.oeis.a393;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393716 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A393716 extends Sequence1 {

  private static final MessageDigest SHA256;
  static {
    try {
      SHA256 = MessageDigest.getInstance("SHA256");
    } catch (final NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  private static byte[] sha1(final byte[] s) {
    SHA256.reset();
    return SHA256.digest(s);
  }

  private byte[] mLargest = null;
  private byte[] mHash = null;
  private long mIterations = 0;

  @Override
  public Z next() {
    if (mHash == null) {
      mHash = new byte[32];
      mLargest = mHash;
      return Z.ZERO;
    }
    while (true) {
      ++mIterations;
      mHash = sha1(mHash);
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
