package irvine.oeis.a336;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336327.
 * @author Sean A. Irvine
 */
public class A336327 implements Sequence {

  private static final class Post {

    // Use a circular buffer and grow it if necessary

    private final boolean[] mSeq;
    private int mStart;
    private int mEnd;

    private Post(final boolean[] seq, final int start, final int end) {
      mSeq = new boolean[2 * seq.length];
      mStart = 0;
      mEnd = 0;
      int s = start;
      do {
        mSeq[mEnd++] = seq[s];
        if (++s == seq.length) {
          s = 0;
        }
      } while (s != end);
    }

    private int length() {
      return mEnd > mStart ? mEnd - mStart : mEnd + mSeq.length - mStart;
    }

    private Post step() {
      if (length() < 3) {
        return this;
      }
      if (mSeq[mStart]) {
        final Post post = length() >= mSeq.length - 1 ? new Post(mSeq, mStart, mEnd) : this;
        post.mSeq[post.mEnd++] = false;
        if (post.mEnd == post.mSeq.length) {
          post.mEnd = 0;
        }
        post.mSeq[post.mEnd++] = true;
        if (post.mEnd == post.mSeq.length) {
          post.mEnd = 0;
        }
        post.mSeq[post.mEnd++] = true;
        if (post.mEnd == post.mSeq.length) {
          post.mEnd = 0;
        }
        post.mSeq[post.mEnd++] = false;
        if (post.mEnd == post.mSeq.length) {
          post.mEnd = 0;
        }
        post.mSeq[post.mEnd++] = true;
        if (post.mEnd == post.mSeq.length) {
          post.mEnd = 0;
        }
        post.mStart += 3;
        post.mStart %= post.mSeq.length;
        return post;
      } else {
        mSeq[mEnd++] = false;
        if (mEnd == mSeq.length) {
          mEnd = 0;
        }
        mStart += 3;
        mStart %= mSeq.length;
        return this;
      }
    }

    private boolean isEqual(final Post other) {
      final int l = length();
      if (l != other.length()) {
        return false;
      }
      for (int k = 0, j = mStart, i = other.mStart; k < l; ++k) {
        if (mSeq[j++] != other.mSeq[i++]) {
          return false;
        }
        if (j == mSeq.length) {
          j = 0;
        }
        if (i == other.mSeq.length) {
          i = 0;
        }
      }
      return true;
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final boolean[] s = new boolean[3 * mN];
    for (int k = 0; k < s.length; k += 3) {
      s[k] = true;
    }
    Post a = new Post(s, 0, 0);
    Post b = new Post(s, 0, 0);
    do {
      a = a.step();
      b = b.step().step();
      if (b.length() < 3) {
        return Z.ZERO;
      }
    } while (!a.isEqual(b));
    int cnt = 0;
    do {
      ++cnt;
      a = a.step();
    } while (!a.isEqual(b));
    return Z.valueOf(cnt);
  }
}

