package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.Iterator;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerSet;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000372 Dedekind numbers or Dedekind's problem: number of monotone Boolean functions of n variables, number of antichains of subsets of an <code>n-set</code>, number of elements in a free distributive lattice on n generators, number of Sperner families.
 * @author Sean A. Irvine
 */
public class A000372 implements Sequence {

  // todo not yet working --- will only be good for a few terms
  // todo seems to require some kind of evil distinction around empty sets, i.e. need {{}} is of type Set<Integer>
  // todo pos. could use {{0}} for this purpose, not distinct from {} (i.e. emptyset).
  // After Gus Wiseman

  //private static final FiniteSet<Integer> SPC = new FiniteSet<>(0);
  private static final Set<Set<Integer>> EMPTY_POWER_SET = new FiniteSet<>(new Integer[0]).powerset(); // {{}}
  //private static final Set<Set<Integer>> EMPTY_POWER_SET = new FiniteSet<>(new Integer[] {0}).powerset(); // {{}}
  //private static final Set<Set<Integer>> EMPTY_POWER_SET = new FiniteSet<Set<Integer>>(SPC);
  private int mN = 0;

  private <T> String toString(final Set<T> s) {
    final StringBuilder sb = new StringBuilder();
    sb.append('{');
    for (final T e : s) {
      if (sb.length() > 1) {
        sb.append(',');
      }
      sb.append(e);
    }
    sb.append('}');
    return sb.toString();
  }

  private Set<Set<Integer>> stableSets(final Set<Set<Integer>> u) {
    System.out.println("ss: " + u.size() + " " + toString(u));
    if (u.isEmpty()) {
      return EMPTY_POWER_SET;
    }
    final Iterator<Set<Integer>> it = u.iterator();
    final Set<Integer> w = it.next(); // consume first element
    final FiniteSet<Set<Integer>> u1 = new FiniteSet<>(it);
    assert u1.size().equals(u.size().subtract(1));
    final Set<Set<Integer>> res = stableSets(u1); // everything except first element
    final ArrayList<Set<Integer>> retain = new ArrayList<>();
    for (final Set<Integer> r : u) {
      if (r != w && !r.isSubset(w) && !w.isSubset(r)) {
        retain.add(r);
      }
    }
    final Set<Set<Integer>> ss = stableSets(new FiniteSet<>(retain));
    final ArrayList<Set<Integer>> prepend = new ArrayList<>();
    for (final Set<Integer> s : ss) {
      prepend.add(s.union(w));
    }
    final Set<Set<Integer>> join = res.union(new FiniteSet<>(prepend));
    System.out.println("join: " + join.size() + " " + toString(join) + " w=" + w);
    return join;
  }

  @Override
  public Z next() {
    // todo creation below perhaps should start at 1 to get empty set?
    final Set<Set<Integer>> stableSets = stableSets(new IntegerSet(1, ++mN).powerset());
    System.out.println(toString(stableSets));
    return stableSets.size();
  }
}

/*
stableSets[u_]:=If[Length[u]===0, {{}}, With[{w=First[u]}, Join[stableSets[DeleteCases[u, w]], Prepend[#, w]&/@stableSets[DeleteCases[u, r_/; r===w||SubsetQ[r, w]||SubsetQ[w, r]]]]]];
 */
