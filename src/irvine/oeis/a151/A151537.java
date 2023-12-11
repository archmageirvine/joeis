package irvine.oeis.a151;

import java.util.Iterator;
import java.util.TreeSet;

import irvine.oeis.a096.A096267;

/**
 * A151537 Number of 1-sided polyedges with n edges.
 * @author Sean A. Irvine
 */
public class A151537 extends A096267 {

  protected int compare(final TreeSet<Long> d1, final TreeSet<Long> d2) {
    assert d1.size() == d2.size();
    for (final Iterator<Long> it1 = d1.iterator(), it2 = d2.iterator(); it1.hasNext(); ) {
      final int c = Long.compare(it1.next(), it2.next());
      if (c != 0) {
        return c;
      }
    }
    return 0;
  }

  private int rotate(final int v) {
    final int x = (v >>> Short.SIZE) - BIAS;
    final int y = (v & 0xFFFF) - BIAS;
    return pack(-1 - y, x);
  }

  private long rotate(final long edge) {
    return edge(rotate((int) edge), rotate((int) (edge >>> Integer.SIZE)));
  }

  private TreeSet<Long> rotate(final TreeSet<Long> diagram) {
    final TreeSet<Long> rot = new TreeSet<>();
    for (final long edge : diagram) {
      rot.add(rotate(edge));
    }
    return translate(rot);
  }

  @Override
  protected TreeSet<Long> canon(final TreeSet<Long> diagram) {
    final TreeSet<Long> t = super.canon(diagram);
    TreeSet<Long> min = t;
    TreeSet<Long> r = rotate(t);
    if (compare(r, min) < 0) {
      min = r;
    }
    r = rotate(r);
    if (compare(r, min) < 0) {
      min = r;
    }
    r = rotate(r);
    if (compare(r, min) < 0) {
      min = r;
    }
    return min;
  }

  @Override
  protected void init() {
    final TreeSet<Long> d0 = new TreeSet<>();
    d0.add(edge(pack(0, 0), pack(0, 1)));
    mPolystickDiagrams.add(d0);
  }
}
