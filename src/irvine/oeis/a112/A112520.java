package irvine.oeis.a112;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A112520 Expansion of 2/(3-sqrt(3-2*sqrt(1-4x))).
 * @author Georg Fischer
 */
public class A112520 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A112520() {
    super(0, "[[0],[-32760, 39096,-17456, 3456,-256],[-64800, 76728,-33784, 6528,-464],[2016,-4128, 3096,-1008, 120],[1152,-2370, 1625,-450, 43],[0, 60,-110, 60,-10]]", "1, 1, 1, 3", 0);
  }
}
