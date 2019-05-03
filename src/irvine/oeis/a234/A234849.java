package irvine.oeis.a234;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A234849 Positions of records in iterated <code>MD5</code> applied to empty string.
 * @author Sean A. Irvine
 */
public class A234849 implements Sequence {

  private static final String HEX = "0123456789abcdef";
  private static final MessageDigest MD5;
  static {
    try {
      MD5 = MessageDigest.getInstance("MD5");
    } catch (final NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  private static String md5(final String s) {
    final byte[] bytesOfMessage = s.getBytes(StandardCharsets.UTF_8);
    final StringBuilder sb = new StringBuilder();
    MD5.reset();
    for (final byte b : MD5.digest(bytesOfMessage)) {
      sb.append(HEX.charAt((b >>> 4) & 0xF));
      sb.append(HEX.charAt(b & 0xF));
    }
    return sb.toString();
  }

  private Z mLargest = Z.ZERO;
  private String mPrev = "";
  private long mIterations = 0;

  @Override
  public Z next() {
    while (true) {
      ++mIterations;
      mPrev = md5(mPrev);
      final Z v = new Z(mPrev, 16);
      if (v.compareTo(mLargest) >= 0) {
        if (v.equals(mLargest)) {
          // Actually this check is not strong enough to guarantee cycle
          // detection, since we might enter a smaller cycle that does
          // not contain the current largest value.  But short of doing
          // a double step arrangement or remembering intermediate values
          // this is the simplest test to try.
          return null;
        }
        mLargest = v;
        //System.out.println("hash " + mPrev);
        return Z.valueOf(mIterations);
      }
    }
  }
}
