package irvine.oeis.a394;

import java.util.List;

import irvine.oeis.a391.A391498;

/**
 * A394528 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A394528 extends A391498 {

  /** Construct the sequence. */
  public A394528() {
    super(1);
  }

  @Override
  protected boolean accept(final int[] set, final List<Trapezoid> trapezoids) {
    for (final int t : set) {
      for (final int u : set) {
        if (t == u) {
          break;
        }
        if (trapezoids.get(t).getArea() == trapezoids.get(u).getArea()) {
          return false;
        }
      }
    }
    return true;
  }
}

