package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.UnimplementedSequence;

//import java.util.ArrayList;
//import java.util.HashSet;

/**
 * A002369 Number of ways of folding a strip of n rectangular stamps.
 * @author Sean A. Irvine
 */
public class A002369 extends Sequence1 implements UnimplementedSequence {

  // Possibly erroneous form of A056780

  // This does not seem to count the correct thing
  // insufficient detail

  /*
  private int mN = 0;
  private HashSet<ArrayList<Integer>> mFolded = new HashSet<>();

  private ArrayList<ArrayList<Integer>> strip(final int n) {
    final ArrayList<ArrayList<Integer>> r = new ArrayList<>();
    for (int k = 0; k < n; ++k) {
      final ArrayList<Integer> col = new ArrayList<>();
      col.add(k + 1);
      r.add(col);
    }
    return r;
  }

  private ArrayList<Integer> upsideDown(final ArrayList<Integer> fold) {
    final ArrayList<Integer> f = new ArrayList<>();
    for (int k = fold.size() - 1; k >= 0; --k) {
      f.add(-fold.get(k));
    }
    return f;
  }

  private void process(final ArrayList<Integer> fold) {
    if (mFolded.contains(fold)) {
      return; // Already have it
    }
    if (mFolded.contains(upsideDown(fold))) {
      return;
    }
    // Reverse strip
    final int n = fold.size() + 1;
    final ArrayList<Integer> rev = new ArrayList<>();
    for (int k = 0; k < fold.size(); ++k) {
      final int c = fold.get(k);
      rev.add(c < 0 ? -n - c : n - c);
    }
    //System.out.println("rev=" + rev);
    if (mFolded.contains(rev)) {
      return;
    }
    if (mFolded.contains(upsideDown(rev))) {
      return;
    }
    // Must be something new
    System.out.println(fold);
    mFolded.add(fold);
  }

  private void foldUp(final ArrayList<ArrayList<Integer>> strip, final int pos) {
    // Selected fold position becomes the first position in the new list
    // Entries to the left of the pos need to be first but in inverted order
    final ArrayList<ArrayList<Integer>> r = new ArrayList<>();
    for (int k = pos, j = pos - 1; k < strip.size() || j >= 0; ++k, --j) {
      final ArrayList<Integer> col = new ArrayList<>();
      if (j >= 0) {
        final ArrayList<Integer> list = strip.get(j);
        for (int i = list.size() - 1; i >= 0; --i) {
          col.add(-list.get(i));
        }
      }
      if (k < strip.size()) {
        col.addAll(strip.get(k));
      }
      r.add(col);
    }
    fold(r);
  }

  private void foldDown(final ArrayList<ArrayList<Integer>> strip, final int pos) {
    // Selected fold position becomes the first position in the new list
    // Entries to the left of the pos need to be appended but in inverted order
    final ArrayList<ArrayList<Integer>> r = new ArrayList<>();
    for (int k = pos, j = pos - 1; k < strip.size() || j >= 0; ++k, --j) {
      final ArrayList<Integer> col = new ArrayList<>();
      if (k < strip.size()) {
        col.addAll(strip.get(k));
      }
      if (j >= 0) {
        final ArrayList<Integer> list = strip.get(j);
        for (int i = list.size() - 1; i >= 0; --i) {
          col.add(-list.get(i));
        }
      }
      r.add(col);
    }
    fold(r);
  }

  private void fold(final ArrayList<ArrayList<Integer>> strip) {
    if (strip.size() == 1) {
      // Strip is already fully folded
      process(strip.get(0));
    } else {
      // Choose fold point
      for (int k = 1; k < strip.size(); ++k) {
        foldUp(strip, k);
        foldDown(strip, k);
      }
    }
  }

  @Override
  public Z nextQ() {
    final ArrayList<ArrayList<Integer>> strip = strip(++mN);
    mFolded.clear();
    fold(strip);
    return Z.valueOf(mFolded.size());
  }
  */

  @Override
  public Z next() {
    return null;
  }
}
