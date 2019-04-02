package irvine.oeis.a162;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A162721 A positive integer n is included if when n is represented in binary, it contains the binary representation of every distinct prime dividing n as substrings, without overlapping of the substrings.
 * @author Sean A. Irvine
 */
public class A162721 extends A162722 {

  private boolean check(final String s, final String[] sp, int remaining) {
    if (remaining == 0) {
      return true;
    }
    final String[] st = new String[remaining];
    for (int k = 0, j = 0; k < sp.length; ++k) {
      if (sp[k] != null) {
        st[j++] = sp[k];
      }
    }

    // Only the overlap constraint left to check.
    // Handle factors with only one placement first
    String r = s;
    for (int k = 0; k < st.length; ++k) {
      final String p = st[k];
      final int a = r.indexOf(p);
      if (a == -1) {
        // Previous placements have now made it impossible
        return false;
      }
      if (r.indexOf(p, a + 1) == -1) {
        // Only one possible placement, and that is at a, so
        // make a replacement and continue with next item
        r = r.substring(0, a) + "X" + r.substring(a + p.length());
        st[k] = null;
        --remaining;
      }
    }
    if (remaining == 0) {
      return true;
    }

    // Choose a victim and recurse on whatever is left
    // Start with the bigger primes since they likely lead to quicker rejection
    int k = st.length;
    while (st[--k] == null) {
      // do nothing
    }
    final String pp = st[k];
    if (remaining == 1 && r.contains(pp)) {
      return true;
    }
    --remaining;
    st[k] = null;
    // Found a victim at k, iterate over possible placements of k in "remaining"
    int pos = -1;
    while ((pos = r.indexOf(pp, pos + 1)) != -1) {
      final String t = r.substring(0, pos) + "X" + r.substring(pos + pp.length());
      if (check(t, st, remaining)) {
        return true;
      }
    }
    st[k] = pp;
    return false;
  }

  @Override
  protected boolean check(final String s, final FactorSequence fs) {
    final Z[] primes = fs.toZArray();
    final String[] sp = new String[primes.length];
    for (int k = 0; k < primes.length; ++k) {
      sp[k] = primes[k].toString(2);
      if (!s.contains(sp[k])) {
        return false;
      }
    }
    return check(s, sp, sp.length);
  }
}

