package irvine.oeis.a158;
// manually holsig/holos at 2022-09-29 21:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A158348 Number of n-colorings of the Hypercube Graph Q4.
 * @author Georg Fischer
 */
public class A158348 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A158348() {
    super(0, "[0,1,-17,136,-680,2380,-6188,12376,-19448,24310,-24310,19448,-12376,6188,-2380,680,-136,17,-1]",
      "0,0,2,2970,1321860,187430900,10199069190,269591166222,4221404762120,44876701584360,355148098691850,2230178955481730,11630998385335692,52097117078470620,205557074788375310,728566149746575350,2355657801908655120",
      0);
  }
}
