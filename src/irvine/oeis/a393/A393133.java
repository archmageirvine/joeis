package irvine.oeis.a393;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393133 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A393133 extends Sequence1 {

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

  private byte[] mHash = new byte[0];
  private byte[] mSmallest = new byte[16];
  private long mIterations = 0;
  {
    Arrays.fill(mSmallest, (byte) -1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mIterations;
      mHash = md5(mHash);
      //System.out.println("hash 0x" + ByteUtils.toHex(mHash));
      final int c = Arrays.compareUnsigned(mHash, mSmallest);
      if (c == 0) {
        // Actually this check is not strong enough to guarantee cycle
        // detection, since we might enter a smaller cycle that does
        // not contain the current largest value.  But short of doing
        // a double step arrangement or remembering intermediate values
        // this is the simplest test to try.
        return null;
      }
      if (c < 0) {
        mSmallest = mHash;
        return Z.valueOf(mIterations);
      }
    }
  }
}
