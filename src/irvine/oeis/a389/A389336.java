package irvine.oeis.a389;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A389336 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A389336 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;
  private int mK = 1;
  private final Bumper mBumper = BumperFactory.range(0, 1);
  private int[] mB = {};
  private final HashMap<String, Integer> mDecode = new HashMap<>();
  private final ArrayList<String> mEncode = new ArrayList<>();

  private void stepCode() {
    if (!mBumper.bump(mB)) {
      mB = new int[mB.length + 1];
    }
    final StringBuilder sb = new StringBuilder();
    for (final int v : mB) {
      sb.append(v);
    }
    final String s = sb.toString();
    mDecode.put(s, mK);
    mEncode.add(s);
    ++mK;
  }

  /**
   * Encode a position as a string.
   * @param n position
   * @return string
   */
  public String encode(final int n) {
    while (n >= mEncode.size()) {
      stepCode();
    }
    return mEncode.get(n);
  }

  /**
   * Decode a string as a position.
   * @param s string
   * @return position
   */
  public int decode(final String s) {
    while (!mDecode.containsKey(s)) {
      stepCode();
    }
    return mDecode.get(s);
  }

  private Z t(final int n, final int m) {
    return Z.valueOf(decode(encode(n) + encode(m)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
