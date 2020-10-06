package irvine.oeis.a023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023192 Conjecturally, number of infinitely-recurring prime patterns on n consecutive integers.
 * @author Sean A. Irvine
 */
public class A023192 implements Sequence {

  // Incrementally add "p" or "c" to the front of each existing solution from previous
  // iteration. Adding "c" is easy. Adding "p" need to check that does not introduce a
  // situation where one of the "p"'s is guaranteed to be divisible by some number.

  protected List<String> mAdmissable = Collections.singletonList("");
  protected final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final List<String> a = new ArrayList<>();
    outer:
    for (final String s : mAdmissable) {
      a.add("c" + s); // can always add a composite
      final int firstP = s.indexOf('p');
      if (firstP < 0) {
        a.add("p" + s); // first prime
      } else if ((firstP & 1) != 0) { // excludes pp, pccp, pccccp, etc.
        // For prime q, look at the "p" positions in s modulo q.
        // If every residue occurs then the candidate is bad, since at least
        // one of those positions will be divisible by the prime q.
        final String candidate = "p" + s;
        for (long q = 3; q <= (candidate.length() + 1) / 2; q = mPrime.nextPrime(q)) {
          long seenResidues = 0;
          for (int d = 0; d >= 0; d = candidate.indexOf('p', d + 1)) {
            seenResidues |= 1L << (d % q);
          }
          if (seenResidues == (1L << q) - 1) {
            continue outer;
          }
        }
        a.add(candidate);
      }
    }
    mAdmissable = a;
    //System.out.println(a);
    return Z.valueOf(a.size());
  }
}

