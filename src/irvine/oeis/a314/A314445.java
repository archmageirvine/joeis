package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314445 Coordination sequence Gal.3.33.2 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314445 extends TilingSequence {

  /** Construct the sequence. */
  public A314445() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A240-3,C120+1"
        , "6.3.3.3.3;A180-1,A300+1,C60+5,B180+4,C240+4"
        , "4.4.3.3.3;A240+4,C180+2,A300-4,B120+5,B300+3"
        });
    defineBaseSet(1);
  }
}
