package irvine.oeis.a072;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072099.
 * @author Sean A. Irvine
 */
public class A072141 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final List<String> mComponents;

    private State(final List<String> components) {
      assert (components.size() & 1) == 1;
      mComponents = components;
      final StringBuilder sb = new StringBuilder();
      for (final String s : components) {
        sb.append(s);
      }
      mN = new Z(sb);
    }

    private State(final long seed) {
      this(Collections.singletonList(String.valueOf(seed)));
    }

    @Override
    public int compareTo(final State state) {
      return mN.compareTo(state.mN);
    }

    private Set<State> children() {
      final HashSet<State> children = new HashSet<>();
      final int len = mComponents.size();
      // Deal with adding extra 0's (note is "" used for no inserted 0's)
      for (int k = 1; 2 * k < len; k += 2) {
        // Odd components are introduced zeros
        assert mComponents.get(k).equals(mComponents.get(len - k - 1)); // symmetry expectation
        final List<String> c = new ArrayList<>(mComponents.size());
        c.addAll(mComponents.subList(0, k));
        final String z = mComponents.get(k) + "0";
        c.add(z);
        if (2 * k != len - 1) {
          c.addAll(mComponents.subList(k + 1, len - k - 1));
          c.add(z);
        }
        c.addAll(mComponents.subList(len - k, len));
        //System.out.println(mComponents + " ->0 " + c);
        children.add(new State(c));
      }
      // Deal with adding extra 9's
      for (int k = 0; 2 * k < len; k += 2) {
        assert mComponents.get(k).equals(mComponents.get(len - k - 1)); // symmetry expectation
        final List<String> c = new ArrayList<>(mComponents.size());
        c.addAll(mComponents.subList(0, k));
        final String t = mComponents.get(k);
        final String z = t.substring(0, t.length() / 2) + "9" + t.substring(t.length() / 2);
        c.add(z);
        if (2 * k != len - 1) {
          c.addAll(mComponents.subList(k + 1, len - k - 1));
          c.add(z);
        }
        c.addAll(mComponents.subList(len - k, len));
        //System.out.println(mComponents + " ->9 " + c);
        children.add(new State(c));
      }
      // Duplicate the near middle element
      final List<String> cc = new ArrayList<>(len + 2);
      final int half = len / 2;
      final int pos = half & ~1;
      cc.addAll(mComponents.subList(0, pos + 1));
      cc.add((half & 1) == 0 ? "" : mComponents.get(pos + 1));
      cc.add(mComponents.get(pos));
      cc.addAll(mComponents.subList(pos + 1, len));
      // System.out.println(mComponents + " ->dup: " + cc);
      children.add(new State(cc));
      return children;
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();

  protected A072141(final long... seeds) {
    for (final long seed : seeds) {
      mA.add(new State(seed));
    }
  }

  /** Construct the sequence. */
  public A072141() {
    this(2178, 6534);
  }

  @Override
  public Z next() {
    final State s = mA.pollFirst();
    mA.addAll(s.children());
    return s.mN;
  }
}
