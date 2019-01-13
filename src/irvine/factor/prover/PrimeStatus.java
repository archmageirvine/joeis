package irvine.factor.prover;

/**
 * Enumeration indicating status of a number resulting from a particular test.
 * @author Sean A. Irvine
 */
public enum PrimeStatus {
  /** Status is unknown. e.g. test could not be applied. */
  UNKNOWN,
  /** Number is definitely composite or 0 or 1. */
  COMPOSITE,
  /** Number is a probable prime. */
  PROB_PRIME,
  /** Number is provably prime. */
  PRIME;
}
