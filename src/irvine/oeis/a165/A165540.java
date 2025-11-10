package irvine.oeis.a165;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A165540 Number of permutations of length n which avoid the patterns 1234 and 2341.
 * @author Georg Fischer
 */
public class A165540 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A165540() {
    super(0, "[[0],[21060,-5148, 312],[-160826, 45096,-3118],[450826,-148402, 11904],[-580630, 234836,-22582],[367130,-196643, 23697],[-109882, 91129,-14703],[9272,-22766, 5532],[2422, 2545,-1241],[-530,-1, 153],[24,-16,-8]]", "1, 1, 2, 6, 22, 89, 376, 1611, 6901, 29375, 123996, 518971, 2155145, 8888348, 36442184", 0);
  }
}
