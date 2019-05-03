package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168876 Number of reduced words of length n in Coxeter group on 7 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^21 =</code> I.
 * @author Sean A. Irvine
 */
public class A168876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168876() {
    super(new long[] {-15, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, new long[] {1, 7, 42, 252, 1512, 9072, 54432, 326592, 1959552, 11757312, 70543872, 423263232, 2539579392L, 15237476352L, 91424858112L, 548549148672L, 3291294892032L, 19747769352192L, 118486616113152L, 710919696678912L, 4265518180073472L});
  }
}
